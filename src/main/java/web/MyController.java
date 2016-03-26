package web;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
		
        @RequestMapping("/hello")
        String x(String name){
            return "Goodnight"+name;
        }
        
        @RequestMapping("/interest")
        double y(double balance){
            return balance * 1.25 /100;
        }
        
        @RequestMapping("/interest/{balance}")
        double calculate(@PathVariable double balance) {
            return balance * 1.25 / 100;
        }
        // homeWork 2.1
        @RequestMapping("/area")
        double area(double radius) {
            return Math.PI * radius * radius;
        }
        // homeWork 2.2
	@RequestMapping("/vat/{price}")
        double vat(@PathVariable double price) {
            return price * 0.07;
        }
        // homeWork 2.3
        @RequestMapping("/zipcode/{city}")
        String zipCode(@PathVariable String city){
            String zipcode ="";
            
            if(city.equals("เมืองนนทบุรี"))
                zipcode = "11000";
            else if(city.equals("บางบัวทอง"))
                zipcode = "11110";
            else if(city.equals("ปากเกร็ด"))
                zipcode = "11120";
            else if(city.equals("บางกรวย"))
                zipcode = "11130";
            else if(city.equals("บางใหญ่"))
                zipcode = "11140";
            else if(city.equals("ไทรน้อย"))
                zipcode = "11150";

            return zipcode;
        }
        
        @RequestMapping("/car-tax/{cc}/{seat}")
        double calculate(@PathVariable int cc, @PathVariable int seat) {
            return (cc * 0.75) + (70 * seat);
        }
        
        @RequestMapping("/walk/{way}")
        int walk(@PathVariable String way) {
            int x = 0;
            int y = 0;
            double c = 0;
            char[] ch1 = way.toCharArray();
	
            for(int i=0; i<ch1.length;i++){
                if (ch1[i] =='N' ){
                    ++x;
		}else if(ch1[i] =='E' ){
                    ++y;
                }else if(ch1[i] =='S' ){
                    --x;
                }else if(ch1[i] =='W' ){
                    --y;
		}
            }
            c = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));	
            return (int)c ;
        }
}
