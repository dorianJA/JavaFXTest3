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
        listPeople.add(new Person("Maxim Alenchev",97,84,72,"bra",10,1,3));
        listPeople.add(new Person("Andrew Korolchak",90,90,85,"rus",89,0,0));
        listPeople.add(new Person("Anton Nemolochnov",80,90,90,"rus",8,1,3));
        listPeople.add(new Person("Igor Matevosyan",80,85,85,"rus",11,1,2));
        listPeople.add(new Person("Denis Pavlov",90,94,80,"rus",7,1,2));
        listPeople.add(new Person("Sergej Karpov",54,67,50,"rus",5,1,0));
        listPeople.add(new Person("Nikolaj Karpov",77,79,82,"rus",1,1,2));
        listPeople.add(new Person("Gena Bashkirov",76,85,89,"rus",13,1,1));
        listPeople.add(new Person("Iliya Krukov",70,77,76,"rus",14,0,0));
        listPeople.add(new Person("Igor Vishnyakov",54,64,60,"rus",15,1,0));
        listPeople.add(new Person("Evgenij Andreev",79,84,83,"rus",69,1,1));
        listPeople.add(new Person("Alex Tsaregorodtsev",92,89,85,"rus",16,1,2));
        listPeople.add(new Person("Max Liumens",79,78,78,"neth",18,1,1));
        listPeople.add(new Person("Denis Salatov",52,56,62,"rus",19,1,0));
        listPeople.add(new Person("Alex Fomichev",91,81,84,"rus",20,0,0));
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
