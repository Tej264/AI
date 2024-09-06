import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HospitalExpertSystem{
private Map<String, String> rules;
public HospitalExpertSystem(){
this.rules = new HashMap<>();
rules.put("fever AND cough", "pneumonia");
rules.put("fever AND headache", "Malaria");
rules.put("cough AND chest pain", "Bronchitis");
rules.put("headache AND fatigue", "Viral Infection");
}
public String diagnose(String symptoms){
for (Map.Entry<String, String> entry : rules.entrySet()){
if (symptoms.contains(entry.getKey())) {
return entry.getValue();
}
}
return "unknown diagnosis";
}
public static void main(String[] args){
HospitalExpertSystem expertSystem = new HospitalExpertSystem();
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to Hospital Expert System!");
System.out.println("Type 'quit' to stop diagnosing.");
while (true) {
System.out.print("Enter symptoms (separate with AND): ");
String symptoms = scanner.nextLine();
if (symptoms.equalsIgnoreCase("quit")) {
break;
}
System.out.println("Diagnosis: " + expertSystem.diagnose(symptoms));
}
}
}
