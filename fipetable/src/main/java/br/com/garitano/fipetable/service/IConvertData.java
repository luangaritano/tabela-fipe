package br.com.garitano.fipetable.service;

public interface IConvertData {
    <T> T jsonToJava(String json, Class<T> classe);
}
