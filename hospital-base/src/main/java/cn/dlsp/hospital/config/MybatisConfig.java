package cn.dlsp.hospital.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置类
 *
 * @author YuJian95  clj9509@163.com
 * @date 2020/1/19
 */

@MapperScan("cn.dlsp.hospital.mapper")
@Configuration
public class MybatisConfig {
}
