package org.example;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import lombok.SneakyThrows;

import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;

/**
 * Hello world!
 */
public class App {

    @SneakyThrows
    public static void main(String[] args) {
        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(new File(App.class.getResource("/sharding.yml").getFile().substring(1)));
        try (final Connection connection = dataSource.getConnection()) {
            try (final PreparedStatement preparedStatement = connection.prepareStatement("select id, name, sharding_key, create_time, is_delete from t_user where id = 677569158061731840 and sharding_key = 1 group by name ")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println(resultSet.getLong("id") + ":" +resultSet.getBoolean("is_delete"));
                    }
                }
            }
        }

        try (final Connection connection = dataSource.getConnection()) {
            try (final PreparedStatement preparedStatement = connection.prepareStatement("select id, name, sharding_key, create_time, is_delete from t_user group by name ")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println(resultSet.getLong("id") + ":" +resultSet.getBoolean("is_delete"));
                    }
                }
            }
        }
    }

}
