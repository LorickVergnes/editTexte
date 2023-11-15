package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {

    @Test
    public void testAjouter() {
        Document doc = new Document();
        doc.ajouter("toto");
        assertEquals("toto", doc.getTexte());
    }

    @Test
    public void testClear() {
        Document doc = new Document();
        doc.ajouter("toto");
        doc.clear();
        assertEquals("", doc.getTexte());
    }



}
