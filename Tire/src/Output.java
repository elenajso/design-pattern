
public class Output {
public static void main(String[] args) {
	Tire tire=new BasicTire();
	tire.sold();
	tire=new Wide(tire);
	tire.sold();
	System.out.println("-----�ٴܰ�-------");
	tire=new Wide(new NoSlip(tire));
	tire.sold();
	tire=new Wide(new NoSlip(new Chained(tire)));
	tire.sold();

}
}
