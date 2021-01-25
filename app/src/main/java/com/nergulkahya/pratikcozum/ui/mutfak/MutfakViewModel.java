package com.nergulkahya.pratikcozum.ui.mutfak;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MutfakViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MutfakViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mutfak İle İlgili 10 Pratik Bilgi" +
                "\n\n" +
                "1-) Hazırladığınız kekin üzerine eritilmiş çikolata dökeceğiniz zaman, çikolataya biraz tereyağı katın. Sonucunda hem lezzet verir hem de çikolatayı yumuşatır." +"\n"+
                "2-) Kek kalıbınızın içine hamurunuzu dökmeden önce ortasına bir şerit alüminyum folyo koyun. Böylece kekinizi pişirdikten sonra kolayca çıkarabilirsinız." +"\n"+
                "3-) Bayatlamış ekmeklerin üzerine su serpin ve folyo kağıda sarıp 5-10 dakika fırınlayın. Böylece taptaze olacaktır." +"\n"+
                "4-) Patlıcanları pişirmeden önce tuzlayın ve bir süre bekletin. Daha sonra soğuk sütten geçirin ve kurulayın. Patlıcanlar daha lezzetli olacaktır. " +"\n"+
                "5-) Tart hamuru açarken hamurun sertleşmemesi ve kıvamının bozulmaması için; hamuru bir naylon poşete koyup merdane ile yuvarlayarak açın." +"\n"+
                "6-) Fırında patates yapmadan önce 10-15 dakika haşlayın ve çatalla delin. Böylece daha kolay pişecektir." +"\n"+
                "7-) Kahvaltı ya da çay saati için hazırladığınız hamur kızartmalarının daha lezzetli olmasını istiyorsanız, hamura eklediğiniz kabartma tozuna biraz toz şeker katın." +"\n"+
                "8-) Sebzelerinizi tuzlu suda yikamayi aliskanlik haline getirin. Tuzlu su, sebzeleri daha etkili ve çabuk temizler." +"\n"+
                "9-) Kuru fasulyeleri dağılmadan pişirmek istiyorsanız tuzu ve salçayı ya da domatesleri fasulyeler yarı piştikten sonra koyun." +"\n"+
                "10-)Maydanozdan daha fazla yararlanmak için saplarını da kullanın. Maydanoz saplarını atmayıp iyice temizledikten sonra çorbalarda kullanabilirsiniz.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
