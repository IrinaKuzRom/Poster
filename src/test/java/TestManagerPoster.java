import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.Manager;




public class TestManagerPoster {
    //@BeforeEach
    String first = "Poster1";
    String second = "Poster2";
    String third = "Poster3";
    String fourth = "Poster4";
    String fifth = "Poster5";
    String sixth = "Poster6";
    String seventh = "Poster7";
    String eighth = "Poster8";
    String ninth = "Poster9";
    String tenth =  "Poster10";
    Manager manager = new Manager();




    @Test
    public void mustShowTenPosters() {

        Manager manager = new Manager(10);
        manager.addPoster(first);
        manager.addPoster(second);
        manager.addPoster(third);
        manager.addPoster(fourth);
        manager.addPoster(fifth);
        manager.addPoster(sixth);
        manager.addPoster(seventh);
        manager.addPoster(eighth);
        manager.addPoster(ninth);
        manager.addPoster(tenth);

        String[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void mustShowElevenPosters() {

        Manager manager = new Manager(11);
        manager.addPoster(first);
        manager.addPoster(second);
        manager.addPoster(third);
        manager.addPoster(fourth);
        manager.addPoster(fifth);
        manager.addPoster(sixth);
        manager.addPoster(seventh);
        manager.addPoster(eighth);
        manager.addPoster(ninth);
        manager.addPoster(tenth);
        String eleven= "Poster11";
        manager.addPoster(eleven);
        String[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleven};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustShowNothing() {
        Manager manager = new Manager(0);
        String[] actual = manager.findAll();
        String[] expected = new String[0];
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustShowValid() {
        Manager manager = new Manager(5);
        manager.addPoster(first);
        manager.addPoster(second);
        manager.addPoster(third);
        manager.addPoster(fourth);
        manager.addPoster(fifth);
        manager.addPoster(sixth);
        manager.addPoster(seventh);
        manager.addPoster(eighth);
        manager.addPoster(ninth);
        manager.addPoster(tenth);

        String[] actual = manager.findLast();
        String[] expected = {tenth,ninth,eighth,seventh,sixth};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void mustShowThreeValid() {
        Manager manager = new Manager(3);
        manager.addPoster(first);
        manager.addPoster(second);
        manager.addPoster(third);
        manager.addPoster(fourth);
        manager.addPoster(fifth);
        manager.addPoster(sixth);
        manager.addPoster(seventh);
        manager.addPoster(eighth);
        manager.addPoster(ninth);
        manager.addPoster(tenth);

        String[] actual = manager.findLast();
        String[] expected = {tenth,ninth,eighth};
        Assertions.assertArrayEquals(expected, actual);

    }


}
