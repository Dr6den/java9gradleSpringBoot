module com.example.demo.modular {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.test;
    requires junit;
    requires kafka.streams;
    requires json;
    //requires camel.kafka;
    exports com.example.demo;
    exports com.example.demo.test;
    //requires junit;
}
