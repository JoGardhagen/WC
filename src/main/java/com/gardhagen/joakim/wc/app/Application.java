package com.gardhagen.joakim.wc.app;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class Application {



  /*  @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("front-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 666, 450);
        stage.setTitle("WC");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }*/
   /* private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");*/
    public static void main(String[] args) {
        try {
            SessionManager sessionManager = new SessionManager();
            sessionManager.read();
            sessionManager.showEvents();
            //sessionManager.readArdess();
            //sessionManager.readArdess();
        }catch (Exception e){
            System.out.println(e);
        }
       /* launch();*/
        /*MainTest mainTest = new MainTest();*/


    }
}