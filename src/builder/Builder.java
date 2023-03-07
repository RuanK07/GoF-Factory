package builder;

import builder.Address;
import builder.AddressBuilder;

public class Builder {

	public static void main(String[] args) {
		
//      startando com o pattern builder dentro da propria classe Address

//		var address = Address.builder()
//				.city("cidade")
//				.street("rua")
//				.complement("complemento");
		
//		startando com o pattern builder em uma classe separada

		var address = AddressBuilder.builder()
			.city("cidade")
			.street("rua")
			.complement("complemento")
			.build();
			
		System.out.println(address);
	}
	
// 	aplicando o pattern builder em metodos q recebam muitos argumentos para facilitar a leitura (boa pratica)
	
	public static void test(TestBuilder testBuilder) {
	}
	
	public static void test2(TestBuilder testBuilder) {
	}
	
	static class TestBuilder {
		private Integer x;
		private Integer y;
		private String s;
		private String p;
		private String w;
		private String z;
		
		public Integer getX() {
			return x;
		}

		public void setX(Integer x) {
			this.x = x;
		}

		public Integer getY() {
			return y;
		}

		public void setY(Integer y) {
			this.y = y;
		}

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		public String getP() {
			return p;
		}

		public void setP(String p) {
			this.p = p;
		}

		public String getW() {
			return w;
		}

		public void setW(String w) {
			this.w = w;
		}

		public String getZ() {
			return z;
		}

		public void setZ(String z) {
			this.z = z;
		}

	}

}

	