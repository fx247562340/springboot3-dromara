package com.xingod.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 文件记录表
 * </p>
 *
 * @author fanxin
 * @since 2023-12-20
 */
@Getter
@Setter
@TableName("file_detail")
public class FileDetail {

    /**
     * 文件id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 文件访问地址
     */
    @TableField("url")
    private String url;

    /**
     * 文件大小，单位字节
     */
    @TableField("size")
    private Long size;

    /**
     * 文件名称
     */
    @TableField("filename")
    private String filename;

    /**
     * 原始文件名
     */
    @TableField("original_filename")
    private String originalFilename;

    /**
     * 基础存储路径
     */
    @TableField("base_path")
    private String basePath;

    /**
     * 存储路径
     */
    @TableField("path")
    private String path;

    /**
     * 文件扩展名
     */
    @TableField("ext")
    private String ext;

    /**
     * MIME类型
     */
    @TableField("content_type")
    private String contentType;

    /**
     * 存储平台
     */
    @TableField("platform")
    private String platform;

    /**
     * 缩略图访问路径
     */
    @TableField("th_url")
    private String thUrl;

    /**
     * 缩略图名称
     */
    @TableField("th_filename")
    private String thFilename;

    /**
     * 缩略图大小，单位字节
     */
    @TableField("th_size")
    private Long thSize;

    /**
     * 缩略图MIME类型
     */
    @TableField("th_content_type")
    private String thContentType;

    /**
     * 文件所属对象id
     */
    @TableField("object_id")
    private String objectId;

    /**
     * 文件所属对象类型，例如用户头像，评价图片
     */
    @TableField("object_type")
    private String objectType;

    /**
     * 文件元数据
     */
    @TableField("metadata")
    private String metadata;

    /**
     * 文件用户元数据
     */
    @TableField("user_metadata")
    private String userMetadata;

    /**
     * 缩略图元数据
     */
    @TableField("th_metadata")
    private String thMetadata;

    /**
     * 缩略图用户元数据
     */
    @TableField("th_user_metadata")
    private String thUserMetadata;

    /**
     * 附加属性
     */
    @TableField("attr")
    private String attr;

    /**
     * 文件ACL
     */
    @TableField("file_acl")
    private String fileAcl;

    /**
     * 缩略图文件ACL
     */
    @TableField("th_file_acl")
    private String thFileAcl;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 对应数据库的列名
     */
    public static final String COL_ID = "id";

    public static final String COL_URL = "url";

    public static final String COL_SIZE = "size";

    public static final String COL_FILENAME = "filename";

    public static final String COL_ORIGINAL_FILENAME = "original_filename";

    public static final String COL_BASE_PATH = "base_path";

    public static final String COL_PATH = "path";

    public static final String COL_EXT = "ext";

    public static final String COL_CONTENT_TYPE = "content_type";

    public static final String COL_PLATFORM = "platform";

    public static final String COL_TH_URL = "th_url";

    public static final String COL_TH_FILENAME = "th_filename";

    public static final String COL_TH_SIZE = "th_size";

    public static final String COL_TH_CONTENT_TYPE = "th_content_type";

    public static final String COL_OBJECT_ID = "object_id";

    public static final String COL_OBJECT_TYPE = "object_type";

    public static final String COL_METADATA = "metadata";

    public static final String COL_USER_METADATA = "user_metadata";

    public static final String COL_TH_METADATA = "th_metadata";

    public static final String COL_TH_USER_METADATA = "th_user_metadata";

    public static final String COL_ATTR = "attr";

    public static final String COL_CREATE_TIME = "create_time";
}
