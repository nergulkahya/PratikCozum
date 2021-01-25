package com.nergulkahya.pratikcozum.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kıyafetler İçin 10 Pratik Bilgi" +
                "\n\n" +
                "1-) Kazak ve yazlık kıyafetlerde en büyük sıkıntı iplikler,onlardan kurtulmak için o minik ipliğin ucuna bir ip bağlayıp daha sonra ipiği iğneye geçirip kıyafetin altına çekin" +"\n"+
                "2-) Düğme dikmek için iğne ipliğiniz yok ise ataç veya çengelli iğne ile anlık sorununuzu çözebilirsiniz." +"\n"+
                "3-) Pantolonunuzun düğmesini kapatamadığınız zaman lastik tokadan yararlanabilirsiniz üzerinede bol bir tişört giyip anlık çözüm üretmiş olursunuz." +"\n"+
                "4-) Sürekli açılan fermuarınız için ise fermuar ucuna bir halka takıp düğmeye geçirirseniz hiç bir sorun kalmayacaktır.." +"\n"+
                "5-) Acil kurutmanız gereken kıyafetleriniz için kıyafetinizi kuru bir havluya sarın yuvarlayıp üzerine basın ,bütün fazla nemi çekecektir.." +"\n"+
                "6-) Yaz günlerinde kıyafetinizde oluşan deodarant lekelerini geçirmek için kıyafatinizi makinaya atmadan önce çamaşır sodası ve sıcak su karışımında en az 1-2 saat bekletin ve lekelerden kurtulun." +"\n"+
                "7-) Eğer spordan çıktıktan sonra kıyafetlerinizi hemen yıkamadıysanız kokunun geçmesi çok zor olur bundan kurtulmak için beyaz sirke ve suyu karıştırıp içerisinde 1-2 saat bekletip makinaya atınız." +"\n"+
                "8-) Kıyafetlerinizdeki çamaşır suyu lekesi için ispirtolu kalemle kurtulabilirsiniz ancak kıyafetiniz koyu renkli olmalıdır." +"\n"+
                "9-) Kilotlu çoraplardaki küçük ten kaçmalarında renksiz ojeyi kaçık olan yere sürüp birleşmesini sağlamak ." +"\n"+
                "10-)Kıyafetinize dökülen kırmızı şarap lekesini beyaz şarap ile veya sirke ile çıkarabilirsiniz.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}