package com.maike.myblog.consts;

/**
 * 常量
 * @ClassName ConstValue
 * @Description
 * @Author Zheng
 * @Date 2018年6月29日 下午3:22:25
 */
public interface ConstValue {

	/**
	 * app的标识字符
	 */
	public String APP_MAIN_ID_KEY = "geek";
	/**
	 * app官方名称 梦极客园
	 */
	public String APP_MAIN_NAME = "梦极客园";
	/**
	 * 分享出去页面的根域名
	 */
	public String APP_SHARE_ROOT = "http://h5.xxx.xxx/user/";
	public String APP_SHARE_NORMAL = "http://h5.xxx.xxx/user/Ndetail.html";
	/**
	 * 分享页面 相对地址 详情
	 */
	public String APP_SHARE_RELATE_PRODUCT = "detail.html";
	/**
	 * 分享页面 店铺
	 */
	public String APP_SHARE_RELATE_STORE = "index.html";
	/**
	 * 分销商默认店铺分享码 8888888888
	 */
	public String SELLER_SHARE_CODE_DEFAULT1 = "8888888888";
	public String SELLER_SHARE_CODE_DEFAULT2 = "6666666666";
	/**
	 * 登录的过期时间 小时单位
	 */
	public Integer LOGIN_OVER_TIME = 24;
	/**
	 * AciveMQ queue EmailQueue
	 */
	public String ACTIVE_MQ_EMAIL_QUEUE = "emailQueue";
	/**
	 * AciveMQ queue MESSAGEQueue
	 */
	public String ACTIVE_MQ_MESSAGE_QUEUE = "messageQueue";
	/**
	 * AciveMQ queue ImageQueue
	 */
	public String ACTIVE_MQ_IMAGE_QUEUE = "imageQueue";
	/**
	 * AciveMQ queue VideoQueue
	 */
	public String ACTIVE_MQ_VIDEO_QUEUE = "videoQueue";

	/**
	 * 用户登录设备类型 电脑端
	 */
	public String LOGIN_DEVICE_PC = "pc";
	/**
	 * 用户登录设备类型 移动端
	 */
	public String LOGIN_DEVICE_MOBILE = "mobile";
	/**
	 * 用户等级 正常用户
	 */
	public Integer USER_LEVEL_NORMAL_USER = 100;
	/**
	 * 用户等级 管理员
	 */
	public Integer USER_LEVEL_ADMIN = 1314;
	/**
	 * 用户等级 超级管理员
	 */
	public Integer USER_LEVEL_SELLER = 396;
	/**
	 * 用户等级 测试人员
	 */
	public Integer USER_LEVEL_VENDOR = 259;
	/**
	 * 状态 正常 Short 0
	 */
	public Short STATUS_NORMAL = 0;
	/**
	 * 状态 正常 Integer 0
	 */
	public Integer STATUS_NORMAL_I = 0;
	/**
	 * 状态 审核 Integer 2
	 */
	public Integer STATUS_AUDITING_I = 2;
	/**
	 * 状态 删除 Integer 1
	 */
	public Integer STATUS_DEL_I = 1;
	/**
	 * 状态 审核中 2
	 */
	public Integer STATUS_UNCHECK = 2;
	/**
	 * 状态 删除 逻辑删除
	 */
	public Short STATUS_DEL = 1;
	/**
	 * 状态 待审核 Short
	 */
	public Short STATUS_CHECK_PENDING = 2;
	/**
	 * 申请合作状态 初始化
	 */
	public Short STATUS_COOPERATION_CHECK_INIT = 0;
	/**
	 * 申请合作状态 审核通过
	 */
	public Short STATUS_COOPERATION_CHECK_SUCCESS = 1;
	/**
	 * 申请合作状态 审核失败
	 */
	public Short STATUS_COOPERATION_CHECK_FAILURE = 2;
	/**
	 * 分页 初始化 1
	 */
	public Integer PC_PAGE_INDEX_INIT = 1;
	/**
	 * 分页 每页记录数 默认 5
	 */
	public Integer PC_PAGE_SIZE_DEFAULT = 13;
	/**
	 * 分页 每页记录数 最小 2
	 */
	public Integer PC_PAGE__SIZE_MIN = 2;
	/**
	 * 分页 每页记录数 最大 101
	 */
	public Integer PC_PAGE_SIZE_MAX = 101;
	/**
	 * 默认密码 123456
	 */
	public String DEFAULT_PASSWORD = "123456";
	/**
	 * 时间令牌 参数key 返回码 code
	 */
	public String TIME_TOKEN_CODE = "code";
	/**
	 * 时间令牌 参数key 消息 message
	 */
	public String TIME_TOKEN_MESSAGE = "message";
	/**
	 * 时间令牌 参数key 结果集 result
	 */
	public String TIME_TOKEN_RESULT = "result";

}
