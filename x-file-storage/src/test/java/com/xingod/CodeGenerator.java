package com.xingod;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.List;

public class CodeGenerator {

    public static void main(String[] args) {
        // 要生成的数据库表名
        List<String> tableNames = Arrays.asList("file_detail");
        // 创建代码生成工具类
        FastAutoGenerator generator = create(tableNames);
        // 执行生成代码
        generator.execute();
    }

    private static FastAutoGenerator create(List<String> tableNames) {
        // 数据库连接地址，
        String url = "jdbc:mysql://localhost:3306/x-file-storage";
        // 数据库用户名
        String name = "root";
        // 数据库密码
        String password = "root";
        FastAutoGenerator generator = FastAutoGenerator.create(url, name, password)
                // 全局配置
                .globalConfig(builder -> {
                    // 获取生成的代码路径,这里没有写死，是运行时获取的，这样可以防止不同的开发人员来回修改生成路径的问题。
                    String outputDir = System.getProperty("user.dir") + "/x-file-storage/src/main/java";
                    builder.outputDir(outputDir)
                            .dateType(DateType.ONLY_DATE)
                            // 生成的类注释中的作者名称，为了统一表示，这里写死了
                            .author("fanxin");
                })
                // 生成的代码包路径配置
                .packageConfig(builder -> {
                    // 生成的代包公共路径
                    builder.parent("com.xingod");
                    // 生成的mapper xml的存放目录，是在parent路径下面的
                    builder.xml("mapper")
                            // 生成的实例类目录
                            .entity("entity")
                            // 生成的service目录
                            .service("service")
                            // 生成的ampper目录
                            .mapper("mapper")
                            //生成的controller目录
                            .controller("controller");

                }).strategyConfig(builder -> {
                    // 添加要生成的的数据库表
                    builder.addInclude(tableNames)
                            // 启用大写模式
                            .enableCapitalMode();
                    // 配置生成的实体类策略，不生成serialVersionID
                    builder.entityBuilder().disableSerialVersionUID()
                            // 如果数据库表名带下划线，按驼峰命名法
                            .columnNaming(NamingStrategy.underline_to_camel)
                            // 使用lombok
                            .enableLombok()
                            //开启实体时字段注解。 会在生成的实体类的字段上，添加注解： @TableField("nickname")
                            .enableTableFieldAnnotation()
                            // 标记实例类的主键生成方式，如果插入时没有指定，刚自动分配一个，默认是雪花算法
                            .idType(IdType.ASSIGN_ID)
                            // 逻辑删除字段名。（与数据库中字段对应）
                            .logicDeleteColumnName("is_deleted")
                            // 逻辑删除属性名。（定义在实体中的属性）。 会在生成的实体类的字段上，添加注解：@TableLogic
                            .logicDeletePropertyName("isDeleted")
                            // 会在实体类的该字段上追加注解[@TableField(value = "create_time", fill = FieldFill.INSERT)]
                            .addTableFills(new Column("create_time", FieldFill.INSERT))
                            // 会在实体类的该字段上追加注解[@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)]
                            .addTableFills(new Column("update_time", FieldFill.INSERT_UPDATE))

                            // 实例类每次生成的时候，覆盖旧的实体类
                            .enableFileOverride()
                            // 第二阶段
                            .mapperBuilder()
                            // 开启 @Mapper 注解。 会在生成的 mapper 类上，添加注解：@Mapper
                            .enableMapperAnnotation()
                            // 启用 BaseResultMap 生成。 会在 mapper.xml文件生成[通用查询映射结果]配置。
                            .enableBaseResultMap()
                            // 启用 BaseColumnList。 会在mapper.xml文件生成[通用查询结果列 ]配置
                            .enableBaseColumnList()

                            // 第三阶段
                            .serviceBuilder()
                            // 设置生成的实体类名称。 默认配置名称前有个I，我习惯添去掉
                            .convertServiceFileName(serviceName -> serviceName + "Service")
                            // 第四阶段
                            .controllerBuilder()
                            // 开启 @RestController 注解。 会在生成的 Controller 类上，添加注解：@RestController
                            .enableRestStyle()

                            // 开启驼峰转连字符
                            .enableHyphenStyle();

                }).templateConfig(builder -> {
                    // 不生成Controller
                    builder.disable(TemplateType.CONTROLLER);
                });
        return generator;
    }
}
