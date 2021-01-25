package com.nergulkahya.pratikcozum.ui.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Uygulamanın asıl amacı günlük" +
                " hayatta en çok karşılaştığımız küçük ama can sıkıcı " +
                "problemlerin pratik çözümlerini göstermek." +
                "\n\n" +
                "Uygulamada geliştirmemi isteğiniz yada beğenmediğiniz kısımları" +" bana mail olarak atabilirsiniz." +
                "\n\n" +
                "Uygulamayı Sunan : Nergül Kahya " +
                "\n" +
                "Mail : nergulkahya224@gmail.com");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
