package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }


    /**
     * on remplace le texte
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * On met en majuscule le texte
     */
    public void majuscules(int start, int end) {
        String maj=texte.substring(start,end).toUpperCase();
        remplacer(start,end,maj);
    }

    /**
     * On efface le texte
     */
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }


    public void clear(){
        remplacer(0,texte.length(),"");
    }
    public void inserer(int position,String insertion){
        String leftPart = texte.substring(0,position+1);
        String rightPart = texte.substring(position+1);
        texte=leftPart + insertion + rightPart;
    }


}
