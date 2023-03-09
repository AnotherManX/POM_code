package com.huazheng.tunny.pom.api.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
  import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 审批流信息表
 *
 * @author tunny code generator
 * @date 2020-06-18 12:37:28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("pom_audit")
public class PomAudit extends Model<PomAudit> {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Integer id;
	/**
	 * 流程id
	 */
	private String processId;
	/**
	 * 流程业务主键
	 */
	private String businessKey;
	/**
	 * 闭环时间
	 */
	private LocalDateTime closedLoopTime;
	/**
	 * 流水号
	 */
	private String bizKey;
	/**
	 * 任务id
	 */
	private String taskId;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 下一办理节点办理人
	 */
	private String nodeusers;
	/**
	 * 下一办理节点名称
	 */
	private String nodename;
	/**
	 * 流程实例关联的流程图版本号
	 */
	private String versions;
	/**
	 * 审批
	 */
	private String defKey;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 删除标识
	 */
	private String delFlag;
	/**
	 * 删除人id
	 */
	private Integer delUserId;
	/**
	 * 删除人姓名
	 */
	private String delUserName;
	/**
	 * 删除时间
	 */
	private LocalDateTime delTime;
	/**
	 * 创建用户id
	 */
	private Integer createUserId;
	/**
	 * 创建用户工号
	 */
	private String createUserNo;
	/**
	 * 创建用户名称
	 */
	private String createUserName;
	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;
	/**
	 * 附件id
	 */
	private String enclosureId;
	/**
	 * 业务id
	 */
	private String businessId;
	/**
	 * 备用
	 */
	private String spareA;
	/**
	 * 备用
	 */
	private String spareB;
	/**
	 * 备用
	 */
	private String spareC;
	/**
	 *
	 */
	private String modular;
	/**
	 * 业务主键 例：pom_plan主键
	 */
	private String formKey;
	/**
	 * 流程defKey
	 */
	private String formType;
	/**
	 * 流程名字
	 */
	private String formName;
	/**
	 * 流程来源系统
	 */
	private String formSource;
	/**
	 * 项目uuid
	 */
	private String projectuuid;
	/**
	 * 流程审批意见
	 */
	private String opinion;

  /**
   * 主键值
   */
  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
