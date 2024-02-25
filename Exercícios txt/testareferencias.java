
    class TestaReferencias	{
        public	static	void	main(String[]	args) {
        	conta	c1	=new conta();
			c1.deposita(100);
			conta	c2	=c1;		//	linha	importante!
			c2.deposita(200);
			System.out.println(c1.saldo);
			System.out.println(c2.saldo);
		}
	}