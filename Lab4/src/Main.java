public class Main
{
    public static void main(String[] args)
    {
        Nameable film1 = new Film("Interstellar", "Christopher Nolan");
        Nameable series1 = new Series("Game of Thrones", 60);
        film1.outputName();
        series1.outputName();

        System.out.println(film1.getName());
        System.out.println(series1.getName());
    }

}


