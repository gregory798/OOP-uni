class Voyage{
    String id;
    boolean isCoup;
    String idCoup;

    Voyage(String i){
        this.id = i;

    }

    public void coupler(Voyage v){
        this.isCoup = true;
        this.idCoup = v.id;
        v.isCoup = true;
        v.idCoup = this.id;
    }

    public String toString(){
        String u;
        if(!this.isCoup){
            u = this.id + " (individuel)";
        }else{
            u = this.id + " (couple avec "+this.idCoup+")";
        }
        return u;
    }

    public static void main(String[] args) {
        Voyage v1 = new Voyage("AZ246");
        Voyage v2 = new Voyage("FDZ241");
        v1.coupler(v2);
        System.out.println(v1);
        System.out.println(v2);
        
        /*
        AZ246 (couple avec FDZ241)
        FDZ241 (couple avec AZ246)
         */

    }
}
