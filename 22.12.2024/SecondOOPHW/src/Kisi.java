public class Kisi{
    String isim;
    int yas;
    String tur;
    int calismasaati;
    int saatlikmaas;

        public Kisi(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
        }

        public String getİsim(){
            return isim;
        }

        public void setİsim(String isim){
            this.isim= isim;
        }

        public int getYas(){
            return yas;
        }

        public void setYas(int yas){
            this.yas =  yas;
        }
    
    }

    class Yolcu extends Kisi{
         

        public Yolcu(String isim, String tur, int yas){
            super(isim, yas);
        this.tur = tur;
    }

    public String getTur(){
        return tur;
    }

    public void setTur(String tur){
        this.tur = tur;
    }

} 

 class Sofor extends Kisi {
    

    public Sofor(String isim, int yas, int calismasaati, int saatlikmaas ){
        super(isim, yas);
        this.calismasaati = calismasaati;
        this.saatlikmaas = saatlikmaas;
    }

    public int getCalismaSaati(){
        return calismasaati;
    }

    public void setCalismaSaati(int calismasaati){
        this.calismasaati = calismasaati;
    }
    public int getSaatlikMaas(){
        return saatlikmaas;
    }

    public void setSaatlikMaas(int saatlikmaas){
        this.saatlikmaas = saatlikmaas;
    }

    public int SoforMaas(){
        return calismasaati * saatlikmaas * 30;
    }


}

