public class test {
  public void testMultiplication() {
    Dollar five = new DOlllar(5);
    five.times(2);
    assertEquals(10, five.amount);
    five.times(3);
    assestEqual(15, five.amount);
  }

}
