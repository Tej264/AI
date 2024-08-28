import java.util.*;

class Chatbot{
     private Map<String, List<String>> intents = new HashMap<>();
     
     public Chatbot(){
          intents.put("greetings", Arrays.asList("Hello! How can I assist you?" , "Hi! What brings you here?", "Hey! How can I help?"));
          intents.put("thanks", Arrays.asList("You're welcome!", "No problem!", "Anytime!"));
          intents.put("goodbye",Arrays.asList("Goodbye! Have a great day!", "See you later!", "Bye for now!"));
          intents.put("help", Arrays.asList("How can I assist you?", "what do you need help with?", "I'm here to help!"));
          intents.put("unknown", Arrays.asList("I didn't understand that.", "could you please rephrase?", "I'm not sure what you mean."));
          }
      public String matchIntent(String message){
          if (message.toLowerCase().contains("hello") || message.toLowerCase().contains("hi") || message.toLowerCase().contains("hey")){
             return "greetings";
          } else if (message.toLowerCase().contains("thank you") || message. toLowerCase(). contains("thanks")){
             return "thanks";
          } else if (message.toLowerCase().contains("bye") || message.toLowerCase(). contains("goodbye")){
             return "goodbye";
          } else if (message.toLowerCase().contains("help") || message.toLowerCase(). contains("assistance")){
             return "help";
          }else{
             return "unknown";
             }
          }
      public String getResponse(String intent){
          List<String> responses = intents.get(intent);
          return responses.get(new Random().nextInt(responses.size()));
      }
      public void chat(){
          System.out.println("welcome to our custmor support chatbot!");
          Scanner scanner = new Scanner(System.in);
          while (true) {
              System.out.print("User: ");
              String message = scanner.nextLine();
              String intent = matchIntent(message);
              String response = getResponse(intent);
              System.out.println("Chatbot: " +response);
              if (intent.equals("goodbye")){
                  break;
              }
          }
       }
       public static void main(String[] args) {
          Chatbot chatbot = new Chatbot();
          chatbot.chat();
       }
   }          