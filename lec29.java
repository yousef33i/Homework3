import javax.swing.JOptionPane;
public class lec29 {

	public static int yousef(String[] name ) {
		
		int Longername=0;
	    int name_centering=0;
		
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>Longername) {
			 Longername=name[i].length();
			 name_centering=i;
			}
				
		}
	
		
		return (Longername);
		
		/*gh*/
	}
	public static int y(String[] name ) {
		
		int Longername=0;
	    int name_centering=0;
		
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>Longername) {
			 Longername=name[i].length();
			 name_centering=i;
			}
				
		}
	
		
		return (name_centering);
		
		/*gh*/
	}
	
	public static void main(String[] args) {
	String name[]= {"ahmed","abdulrhman","yousef"};	
	 

	System.out.println(yousef(name));
	System.out.println(y(name));
	}

	}


