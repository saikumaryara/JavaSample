
		interface I1{ 
			void m1();
		}

		interface I2{ 
			void m1();
		}

		interface I3{ 
			void m1(int x);
		}
		
		class Example {
			void m3(I1 i1){ System.out.println("I1-param");}
			void m3(I2 i2){System.out.println("I2-param"); }

			void m4(I1 i1){System.out.println("I1-param"); }
			void m4(I3 i1){System.out.println("I3-param"); }
		}

		class Test {
			public static void main(String[] args) {
				Example e1 = new Example();
				//e1.m3(() -> { }); // CE: ambiguas error 

				e1.m3((I1)() -> { });  
				e1.m3((I2)() -> { }); 
                e1.m4(()->{});
                e1.m4((x)->{});
			}
		}
