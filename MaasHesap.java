public class MaasHesap {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public MaasHesap(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
        double tax (double salary){
        if (this.salary>1000){
            return salary* (0.03);
        }
        return salary;
    }
    int bonus (int workHours){
        int moreHours ;
        int totalBonus = 0;
        if (workHours>40){
            moreHours= workHours  - 40;
            totalBonus = moreHours*30;
            return totalBonus;
        }
        return totalBonus ;
    }
    double raiseSalary(int hireYear) {
        int todaysYear = 2021;
        if ((todaysYear - hireYear) < 10) {
            return (this.salary * 0.05);
        } else if ((todaysYear - hireYear > 9) && (todaysYear - hireYear < 20)) {
            return (this.salary * 0.10);
        } else if ((todaysYear - hireYear) > 19) {
            return (this.salary * 0.15);
        }
        return 0;
    }

    void tooString(){
        System.out.println(this.name+"\n"+"maasi : "+this.salary+"\n"+"calisma saati : "+this.workHours+"\n"+
                "baslangic yili : "+this.hireYear+"\n"+"vergi : "+tax(this.salary)+"\n"+
                "bonus : "+bonus(this.workHours)+"\n"+"maas artisi : "+raiseSalary(this.hireYear)+"\n"+
                "vergi ve bonuslar eklenince maas : "+(this.salary-tax(this.salary)+bonus(this.workHours))+"\n" +
                "toplam maas : "+(this.salary+tax(this.salary)+bonus(this.workHours)+raiseSalary(this.hireYear)));


    }

}
