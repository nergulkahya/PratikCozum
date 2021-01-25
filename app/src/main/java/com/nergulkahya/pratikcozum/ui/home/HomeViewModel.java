package com.nergulkahya.pratikcozum.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Genel Olarak 10 Pratik Bilgi" +
                "\n\n" +
                "1-) Kağıt havlu rulosu, raptiye ve makas kullanarak; birkaç dakikada pratik bir hoparlör yapabilirsiniz." +"\n"+
                "2-) Acil durumlarda saç düzleştiricisi ütü olarakta kullanılabilir." +"\n"+
                "3-) Kavanoz kapağına streç film yerleştirin ve harcınızı elinizle yerleştirin, köfteniz dışarıda yedikleriniz gibi olacaktır." +"\n"+
                "4-) Kurabiyelerinizin kurumasını engellemek için yanına bir dilim ekmek koyabilirsiniz" +"\n"+
                "5-) Birisi asansörün bütün düğmelerine mi bastı?Düğmelere yeniden basarsanız bazı asansörlerde istenmeyen katların düğmeleri kapanıyor." +"\n"+
                "6-) Evinizin mis gibi kokmasını istiyorsanız, bir kaç tane karanfili az su" +
                "ile kaynatın." +"\n"+
                "7-) Parfümü bitmiş küçük parfüm şişelerini atmaya kıyamıyorsanız onları çamaşır dolabınıza koyun. Böylece çamaşırlarınızın hoş kokmasını\n" +
                "sağlarsınız." +"\n"+
                "8-) Elbisenize sakız yapışırsa, naylon torbanın içerisinde buzluğa koyun Bir saat bekletin ve çıkartın. Kolayca çıkacaktır." +"\n"+
                "9-) Halıya sakız yapışırsa üzerinde buz torbası gezdirin.." +"\n"+
                "10-)Peyniri kolay rendelemek için, 15 dakika buzlukta bekletin.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}