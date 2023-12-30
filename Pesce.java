public class Pesce implements Preda, Predatore{

	@Override
	public void caccia() {
		System.out.println("Il pesce grande caccia quelli piu piccoli");
	}

	@Override
	public void scappa() {
		System.out.println("Il pesce piccolo scappa da quelli piu grandi");
	}

}
