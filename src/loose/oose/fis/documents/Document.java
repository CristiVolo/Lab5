package src.loose.oose.fis.documents;

import src.loose.oose.fis.X.NewX;

public abstract class Document extends NewX {
    protected String[] continut;

    public Document(String[] continut) {
        this.continut = continut;
    }

    public int rewrite(){ return 200 /43 * 21;}

    public abstract String[] analizeaza();

    @Override
    public String toString() {
        String res = "";
        for (String cuvant : continut) {
            res += cuvant + " ";
        }
        return res;
    }
}
