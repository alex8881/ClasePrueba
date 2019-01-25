/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosprueba;

/**
 *
 * @author ALEX
 */
class tipo {
        private String vegetales, lacteos, proteinas;

    public tipo(String vegetales, String lacteos, String proteinas) {
        this.vegetales = vegetales;
        this.lacteos = lacteos;
        this.proteinas = proteinas;
    }

    public String getVegetales() {
        return vegetales;
    }

    public void setVegetales(String vegetales) {
        this.vegetales = vegetales;
    }

    public String getLacteos() {
        return lacteos;
    }

    public void setLacteos(String lacteos) {
        this.lacteos = lacteos;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return "tipo{" + "vegetales=" + vegetales + ", lacteos=" + lacteos + ", proteinas=" + proteinas + '}';
    }

}
   


    

