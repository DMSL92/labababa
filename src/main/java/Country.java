public class Country {
public static final int POPULATION_UNKNOWN = -1; //Если неизвестно население - передаем минус 1

    public static void main(String[] args) {
        Country vatikan = new Country("Vatikan", 12, 100);
      //  vatikan.setPopulation(1);
        // vatikan.print();
        System.out.println();
        Country[] countries = new Country[]{
                new Country("Russia", 17_100_000, -1, "Moscow", -1),
                new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000),
                new Country("France", 643_800, 67_800_000, "Paris", -1),
                new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_600),
                new Country("Singapore", 725, 5_700_000)
        };
        Country.printAll(countries);

    }

    String country; //Объявление переменной страна
    long area; //Объявление переменной площади страны
    int population; //население
    String capital; // столица
    int capitalPopulation; // население столицы

    // Конструктор класса

    public Country (String country, long area, int population, String capital, int capitalPopulation) {
        this.country = country;
        this.area = area;
        this.population = population;
        this.capital = capital;
        this.capitalPopulation = capitalPopulation;

    }
    //Конструктор класса для городов-государств без столицы и населения столицы
    public Country (String country, long area, int population){
        this.country = country;
        this.area = area;
        this.population = population;
        this.capital = null;
        this.capitalPopulation = 0;
    }
    //Метод вывода
    public void print() {
        System.out.println("Название страны: " + country);
        System.out.println("Площадь страны: " + area+ " кв.км.");
        if (population != POPULATION_UNKNOWN) {
            System.out.println("Население страны: " + population + " человек");
        }
        else {
            System.out.println("Население неизвестно");
        }
        if (capital != null && capitalPopulation != POPULATION_UNKNOWN) {
            System.out.println("Столица: " + capital);
            System.out.println("Население столицы: " + capitalPopulation+ " человек");
        } else if (capitalPopulation == POPULATION_UNKNOWN){
            System.out.println("Население неизвестно");
        }
        else {
            System.out.println("Столица является городом-государством");
        }

    }

    //Метод вывода массива
    public static void printAll (Country[] countries)
    {
        for (Country country:countries)
        {
            country.print();
            System.out.println();
        }
    }

    //get методы
    public String getCountry(){
        return country;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }
    //get метод возвращающий значение плотности населения страны
    public double getPopulationDensity(){
        return (double) population/area;
    }
    //set методы
    public void setCountry(String country) {
        if (country !=null && !country.isEmpty() ){

            this.country = country; }
        else
        {
            throw new IllegalArgumentException("Ошибка, название не должно быть пустым");
        }}
    public void setArea(long area) {
        if (area >0) {
            this.area = area;}
        else {
            throw new IllegalArgumentException("Ошибка, площадь страны должна быыть больше нуля");}
    }
    public  void setPopulation (int population) {
        if (population>0) {
            this.population=population;}
        else {
            throw new IllegalArgumentException("Ошибка, население страны не может быть меньше нуля ");
        }
    }
    public void setCapital (String capital) {
        if (capital != null && !country.isEmpty()) {
            this.capital = capital;}
        else {
            throw new IllegalArgumentException("Ошибка, название столицы не может быть пустым");
        }
    }

    public void setCapitalPopulation(int capitalPopulation) {
        if (capitalPopulation>0) {
            this.capitalPopulation = capitalPopulation;
        }
        else {
            throw new IllegalArgumentException("Ошибка, население не может быть меньше нуля");
        }
    }
    public void setCapitalData(String capital, int capitalPopulation) {
        if (capital != null && !capital.isEmpty() && capitalPopulation > 0) {
            this.capital = capital;
            this.capitalPopulation = capitalPopulation;
        } else if (capital == null && capitalPopulation == -1) {
            this.capital = null;
            this.capitalPopulation = 0;
        } else {
            throw new IllegalArgumentException("Ошибка, неправильные данные о столице");
        }
    }



}