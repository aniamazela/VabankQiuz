package pl.vabank.game.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;

/**
 * adnotacja @Entity wskazuje klasę QuestionsData jako encję JPA
 * oraz klasa QuestionsData odpowiada tabeli questions_data w bazie danych
 */
@Entity
public class QuestionsData {

    public QuestionsData() {
    }

    /**
     * @param id identyfikator pytania
     * @param questionText treść pytania
     * @param answer1Text pierwszy wariant odpowiedzi
     * @param answer2Text drugi wariant odpowiedzi
     * @param answer3Text trzeci wariant odpowiedzi
     * @param answer4Text czwarty wariant odpowiedzi
     * @param answerCorrect poprawna odpowiedź 
     * @param nameCategory nazwa kategorii
     * @param priceCategory stawka (nagroda) do wygrania
     */
    public QuestionsData(Long id, String questionText, String answer1Text, String answer2Text, String answer3Text,
            String answer4Text, String answerCorrect, String nameCategory, int priceCategory) {
        this.id = id;
        this.questionText = questionText;
        this.answer1Text = answer1Text;
        this.answer2Text = answer2Text;
        this.answer3Text = answer3Text;
        this.answer4Text = answer4Text;
        this.answerCorrect = answerCorrect;
        this.nameCategory = nameCategory;
        this.priceCategory = priceCategory;
    }

    /**
     * adnotacja @Id wskazuje, że pole id typu Long jest identyfikatorem (unikalnym) pytania
     */
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * adnotacje @Column(nullable = false) dla pól questionText, answer1Text, answer2Text,
     * answer3Text, answer4Text, answerCorrect, nameCategory, priceCategory wskazują, 
     * że ww. pola będą zapisywane w kolumnach o takich samych nazwach jak ww.pola 
     * oraz że pola te nie mogą mieć wartości NULL
     */
    @Column(nullable = false)
    private String questionText;

    @Column(nullable = false)
    private String answer1Text;

    @Column(nullable = false)
    private String answer2Text;

    @Column(nullable = false)
    private String answer3Text;

    @Column(nullable = false)
    private String answer4Text;

    @Column(nullable = false)
    private String answerCorrect;

    @Column(nullable = false)
    private String nameCategory;

    @Column(nullable = false)
    private int priceCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswer1Text() {
        return answer1Text;
    }

    public void setAnswer1Text(String answer1Text) {
        this.answer1Text = answer1Text;
    }

    public String getAnswer2Text() {
        return answer2Text;
    }

    public void setAnswer2Text(String answer2Text) {
        this.answer2Text = answer2Text;
    }

    public String getAnswer3Text() {
        return answer3Text;
    }

    public void setAnswer3Text(String answer3Text) {
        this.answer3Text = answer3Text;
    }

    public String getAnswer4Text() {
        return answer4Text;
    }

    public void setAnswer4Text(String answer4Text) {
        this.answer4Text = answer4Text;
    }

    public String getAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(String answerCorrect) {
        this.answerCorrect = answerCorrect;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

}
