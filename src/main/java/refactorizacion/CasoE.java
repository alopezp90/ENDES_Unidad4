package refactorizacion;

public class CasoE {

    static String buscaAnimal(String[] animales) {

        for (String animal : animales) {
            if (animal.equals("Perro")) {
                return "Perro";
            }
            if (animal.equals("Tortuga")) {
                return "Tortuga";
            }
            if (animal.equals("Loro")) {
                return "Loro";
            }
        }
        return "No encontrado";
    }

    public static void main(String[] args) {
        String[] animales1 = {"pez", "pájaro", "León"};
        String[] animales2 = {"pez", "Loro", "León"};

        System.out.println(buscaAnimal(animales1));
        System.out.println(buscaAnimal(animales2));
    }

}
