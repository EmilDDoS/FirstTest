public class User {
    private long id;
    private String developer;
    private Vacancy vacancy;

    User(int id, String developer) {
        this.id = id;
        this.developer = developer;
    }

    String getVacancy() {
        return vacancy.getVacancy(developer);
    }

    long getId() {
        return id;
    }

}
