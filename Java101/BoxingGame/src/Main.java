public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 20); // Örnek olarak Marc'in dodge değeri 20 olarak ayarlandı
        Fighter alex = new Fighter("Alex", 10, 95, 100, 10); // Örnek olarak Alex'in dodge değeri 10 olarak ayarlandı
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}
