package sample.interfaces;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Person;

public class CollectionPeopleImpl implements CollectionPeople {
    private ObservableList<Person> listPeople = FXCollections.observableArrayList();



    @Override
    public void add(Person person) {
        listPeople.add(person);
    }

    @Override
    public void delete(Person person) {
        listPeople.remove(person);
    }

    public ObservableList<Person> getListPeople(){
        return listPeople;
    }

    public void fillPeopleData(){
        listPeople.add(new Person("Аленчев Максим",96,87,70,"bra",10,2,7));
        listPeople.add(new Person("Андреев Евгений",65,65,60,"rus",69,1,2));
        listPeople.add(new Person("Немолочнов Антон",71,87,82,"rus",8,1,4));
        listPeople.add(new Person("Матевосян Игорь",70,80,79,"rus",11,2,4));
        listPeople.add(new Person("Павлов Денис",80,92,73,"rus",7,2,5));
        listPeople.add(new Person("Карпов Сергей",37,30,50,"rus",5,1,0));
        listPeople.add(new Person("Карпов Николай",67,62,73,"rus",1,2,5));
        listPeople.add(new Person("Башкиров Геннадий",60,53,75,"rus",36,1,1));
        listPeople.add(new Person("Крюков Илья",53,59,67,"rus",14,2,3));
        listPeople.add(new Person("Вишняков Игорь",33,34,47,"rus",15,1,0));
        listPeople.add(new Person("Царегородцев Алексей ",89,90,86,"rus",16,1,3));
        listPeople.add(new Person("Льюменс Макс",73,72,66,"neth",18,2,4));
        listPeople.add(new Person("Салатов Денис",30,30,51,"rus",19,2,0));
        listPeople.add(new Person("Фомичев Алексей",77,70,73,"rus",20,2,3));
        listPeople.add(new Person("Корольчак Андрей",86,92,76,"rus",89,1,2));
        listPeople.add(new Person("Титаренко Олег",56,54,74,"rus",21,0,0));
    }

    public ObservableList<Person> high(){
        ObservableList<Person> forHigh = FXCollections.observableArrayList();
        for(int i = 0; i < listPeople.size();i++){
            if(listPeople.get(i).avr() >= 84){
                forHigh.add(listPeople.get(i));
            }
        }
        return forHigh;
    }

    public ObservableList<Person> normal(){
        ObservableList<Person> forNormal = FXCollections.observableArrayList();
        for(int i = 0; i < listPeople.size();i++){
            if(listPeople.get(i).avr() >= 70 && listPeople.get(i).avr() < 84){
                forNormal.add(listPeople.get(i));
            }
        }
        return forNormal;
    }

    public ObservableList<Person> low(){
        ObservableList<Person> forLow = FXCollections.observableArrayList();
        for(int i = 0; i < listPeople.size();i++){
            if(listPeople.get(i).avr() < 70){
                forLow.add(listPeople.get(i));
            }
        }
        return forLow;
    }
    public ObservableList<Person> all(){
        ObservableList<Person> all = FXCollections.observableArrayList();
        for(int i = 0; i < listPeople.size();i++){
                all.add(listPeople.get(i));
        }
        return all;
    }
    public ObservableList<Person> ready(){
        ObservableList<Person> all = FXCollections.observableArrayList();
        for(int i = 0; i < listPeople.size();i++){
            if(listPeople.get(i).isReady()){
                all.add(listPeople.get(i));
            }
        }
        return all;
    }






}
