public class Hari {
    public static void main(String args[]) {
        int tahun=1901;
        boolean tahunKabisat=false;
        int totalMinggu=0;
        int hariini=2;
        while(tahun<=2000){
            tahunKabisat=false;
            if((tahun%4)==0){
                if((tahun%100)==0 && (tahun%400)==0){
                    tahunKabisat=true;
                } else if((tahun%100)==0 && (tahun%400)!=0){
                    tahunKabisat=false;
                } else {
                    tahunKabisat=true;
                }
            }
            System.out.println("Tahun: "+tahun);
            System.out.println("================================");
            for(int bulan=1;bulan<=12;bulan++){
                System.out.println("Bulan: "+bulan+" Hari ini :  "+hariini);
                if(hariini==7){
                    totalMinggu++;
                }
                if(bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12){
                //January,March,May,July,August,October,December
                    hariini+=3;
                } else if(bulan==4 || bulan==6 || bulan==9 || bulan==11){ 
                //April,June,September,November
                    hariini+=2;              
                } else if(bulan==2 && tahunKabisat){
                //February has 29 days in a Leap Year
                    hariini+=1;
                } 

                if(hariini>7){
                    hariini=hariini-7;
                }
                System.out.println("Updated Hari ini :  "+hariini);
            }
            System.out.println("================================");
            tahun++;
        }
        System.out.println("Jumlah Hari Minggu: "+totalMinggu);
    }
}