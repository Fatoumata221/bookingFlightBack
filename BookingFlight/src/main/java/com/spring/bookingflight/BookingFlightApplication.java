package com.spring.bookingflight;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class BookingFlightApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingFlightApplication.class, args);
    }
    @Bean
    public ModelMapper getModel() {
        ModelMapper mapper = new ModelMapper();
        Converter<String, LocalDate> converter = new Converter<String, LocalDate>() {
            @Override
            public LocalDate convert(MappingContext<String, LocalDate> mappingContext) {
                return LocalDate.parse(mappingContext.getSource(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            }

        };

        mapper.addConverter(converter);
        Converter<String, LocalTime> converter1 = new Converter<String, LocalTime>() {
            @Override
            public LocalTime convert(MappingContext<String, LocalTime> mappingContext) {
                return LocalTime.parse(mappingContext.getSource(), DateTimeFormatter.ofPattern("HH:mm:ss"));
            }
        };
        mapper.addConverter(converter1);
        return mapper;
    }

}
