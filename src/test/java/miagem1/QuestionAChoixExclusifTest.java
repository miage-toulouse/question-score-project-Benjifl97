/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miagem1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos FL
 */
public class QuestionAChoixExclusifTest {
    
    private QuestionAChoixExclusif uneQuestion;
    //Cette methode va etre initilise a chaque debut de test
    @Before
    public void setUp() throws Exception{
        //given : un objet de type QuestionAChoixExclusif
        this.uneQuestion= new QuestionAChoixExclusif("un énoncé", 2);
    }
    
   
    /**
     * Test of getEnonce method, of class QuestionAChoixExclusif.
     */
    @Test
    public void testGetEnonce() {
        //when: on demande m'énonce à la question 
        String resEnonce=uneQuestion.getEnonce();
        //then : l'énoncé est non null
        assertNotNull(resEnonce);
        //and : l'énoncé est bien celui fourni à la construction
        assertEquals(resEnonce, "un énoncé");
    }

    /**
     * Test of getScoreForIndice method, of class QuestionAChoixExclusif.
     */
    @Test
    public void testGetScoreForIndice() {
         //when : unétudiant fourni l'indice correspondant à la bonne réponse 
      int indiceEtudiant=2;
      //and: on demande le calcule du score
      float resScore =uneQuestion.getScoreForIndice(indiceEtudiant);
      //then: le score obtenu est 100
        assertEquals(100f, resScore, 0.0);
       //when : un étudiant fourni l'indice correspondat à une mauvaise réponse 
       //when : unétudiant fourni l'indice correspondant à la bonne réponse 
      int indiceEtudiant2=3;
      //and: on demande le calcule du score
      float resScore1 =uneQuestion.getScoreForIndice(indiceEtudiant2);
      //then: le score obtenu est 100
        assertEquals(100f, resScore1, 0.0);
       
    }
    
}
