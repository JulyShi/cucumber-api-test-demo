@test
#@ignore

功能：测试Demo

  背景：环境基本设置
    * 目录：features/serviceA
    * 定义变量random=随机值
    * 定义变量id="test_${random}"
    * 定义变量date=当天时间-1天

  场景：测试Demo

  * 环境: http://${serviceA_host}.tw.com
  * URL: /path
  * 请求报文文件: requests/test_request.json
  * 发送请求: POST
  * 返回状态: 200
  * 验证'$.result[0].success' is true
  * 验证'$.result[0].id'=${id}
  * 定义变量test_no='$.result[0].no'

  * 查询数据库: SQL 'select * from table where business_id=${test_no}'
  * 验证返回: '$[0].id'=${id}

  * 执行SQL:
  """
    DELETE FROM table where business_id like "${id}";
  """