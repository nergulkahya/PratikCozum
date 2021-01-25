package com.nergulkahya.pratikcozum.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Otomobil Kullananlar İçin 10 Pratik Bilgi" +
                "\n\n" +
                "1-) Güneşte bekleyen aracınızı hızla soğutmak içinön camlardan birini açın ve sonrasında karşılılı kapıları kapatıp açın.Bu sayede sıcak hava dışarıya çıkacak." +"\n"+
                "2-) Arabanızdaki küçük çizikler için aynı renkteki oje ile 2-3 kat sürerek kurtulabilirsiniz ön cam çatlağı için şeffaf oje işinizi görür.Oje küçük çatlakların büyümesini engeller." +"\n"+
                "3-) Arabanıza önceden yapıştırdığınız yapıştırmaları çıkarmak için bir parça gazete kağıdına ılık suya batırın ve ardından stikerlar üzerinde 10 - 15 dk bekletin." +"\n"+
                "4-) Soğuk kış günlerinde donan kilidi açmak için bir miktar antibakteriyel jeli kilidesürün buz kolayca eriyecektir." +"\n"+
                "5-) Far lambalarını diş macunu ile temizlerseniz pırıl pırıl olduğunu göreceksiniz." +"\n"+
                "6-) Dar garajlarda kapıların çizilmesini engellemek için denizde kullanılan köpük çubukları ikiye bölerek duvara sabitleyin." +"\n"+
                "7-) Telefonunuzu sabitlemek için arabanızın klima kanalına lastik geçirip telefonunuzu sabitlediğinizden emin olun." +"\n"+
                "8-) Bir çorabın içine kedi kumu koyup arabaya koyarsanız camların buğulu olmasını engelleyecektir çünkü kedi kumu nemi içine çeker." +"\n"+
                "9-) İçtiğimiz coco cola 'yı arabanızdaki paslara süungerin yumuşak tarafıyla uygularsanız pas problemi ortadan kalkacaktır." +"\n"+
                "10-)Mutfak pompasına ve arabadaki küçük göçük olan yere sıcak su döküp pompayı göçüğe pastırıp itme çekme işlemi ile küçük göçüklerden kurtulabilirsiniz.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}