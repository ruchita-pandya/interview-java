package com.example.corejava.coreconcepts;

public enum StatusCode {

    OK(100),ACCEPTED(201),BAD_REQUEST(500);

    StatusCode(int i) {
        this.i = i;
    }

    int i;

    public Integer getDescription(){
        return i;
    }

    @Override
    public String toString() {
        return "StatusCode{" +
                "i=" + i +
                '}';
    }
}

class ReturnStatus{
    public static void main(String[] args) {
        StatusCode[] statusCodes=StatusCode.values();
        for (StatusCode code:statusCodes){
            System.out.println(code.name()+" "+code.getDescription());
        }
    }
}
