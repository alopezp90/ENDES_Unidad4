package refactorizacion;

public class CasoC {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String idioma = "Rusa";
        Integer nivelIngles = 0;
        
        final boolean esRuso = idioma.toUpperCase().indexOf("RUS") > -1;
        final boolean esAleman = idioma.toUpperCase().indexOf("ALE") > -1;
        final boolean esIngles = nivelIngles > 0;
        if (esRuso || esAleman || esIngles) {
            System.out.println("MENSAJE EN INGLES");
        }

    }

}
