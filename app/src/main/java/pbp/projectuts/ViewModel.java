package pbp.projectuts;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.text.ParseException;
import java.util.Date;

public class ViewModel extends BaseObservable {
    private User user;


    @Bindable
    public String getUserNama() {
        return user.getNama();
    }

    public void setUserNama(String nama) {
        user.setNama(nama);
        notifyPropertyChanged(BR.nama);
    }

    @Bindable
    public String getTelp() {
        return user.getTelp();
    }

    public void setUserTelp(String telp) {
        user.setTelp(telp);
        notifyPropertyChanged(BR.telp);
    }

    @Bindable
    public int getHarga() {
        return user.getHarga();
    }

    public void setUserHarga(int harga) {
        user.setHarga(harga);
        notifyPropertyChanged(BR.harga);
    }

    @Bindable
    public String getStrnigHarga() {
        return String.valueOf(user.getStrnigHarga());
    }

    public void setStringHarga(String harga) {
        if(!harga.isEmpty()){
            user.setStringHarga(harga);
        } else {
            user.setStringHarga(null);
        }
        notifyPropertyChanged(BR.harga);
    }

    @Bindable
    public double getBerat() {
        return user.getBerat();
    }

    public void setUserNama(int berat) {
        user.setBerat(berat);
        notifyPropertyChanged(BR.berat);
    }

    @Bindable
    public String getStringBerat() { return String.valueOf(user.getStringBerat()); }

    public void setUserStringBerat(String berat) throws ParseException {
        if(!berat.isEmpty()){
            user.setStringBerat(berat);
        } else {
            user.setStringBerat(null);
        }
        notifyPropertyChanged(BR.berat);
    }

    @Bindable
    public Date getTglOrder() {
        return user.getTglOrder();
    }

    public void setUserOrder(Date tglOrder) {
        user.setTglOrder(tglOrder);
        notifyPropertyChanged(BR.tglOrder);
    }

    @Bindable
    public String getStringOrder() { return String.valueOf(user.getStringOrder()); }

    public void setUserStringOrder(String tglOrder) throws ParseException {
        if(!tglOrder.isEmpty()){
            user.setStringOrder(tglOrder);
        } else {
            user.setStringOrder(null);
        }
        notifyPropertyChanged(BR.tglOrder);
    }

    @Bindable
    public Date getTglAmbil() {
        return user.getTglAmbil();
    }

    public void setUserAmbil(Date tglAmbil) {
        user.setTglAmbil(tglAmbil);
        notifyPropertyChanged(BR.tglAmbil);
    }

    @Bindable
    public String getUserStringAmbil() { return String.valueOf(user.getStringAmbil()); }

    public void setUserStringAmbil(String tglAmbil) throws ParseException {
        if(!tglAmbil.isEmpty()){
            user.setStringAmbil(tglAmbil);
        } else {
            user.setStringAmbil(null);
        }
        notifyPropertyChanged(BR.tglAmbil);
    }

    @Bindable
    public String getUserStatus() {
        return user.getStatus();
    }

    public void setUserStatus(String status) {
        user.setStatus(status);
        notifyPropertyChanged(BR.status);
    }
}