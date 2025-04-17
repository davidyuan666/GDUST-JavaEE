以下是在IntelliJ IDEA中启动Spring MVC项目的步骤：

1. **配置Tomcat或其他应用服务器**：
   - 点击顶部菜单栏的"Run" → "Edit Configurations..."
   - 点击"+"按钮，选择"Tomcat Server" → "Local"
   - 在"Server"选项卡中配置Tomcat的路径（如果尚未配置）
   - 在"Deployment"选项卡，点击"+"，选择"Artifact"
   - 选择项目的war包（通常是 `springmvcdemo:war` 或 `springmvcdemo:war exploded`）
   - 设置"Application context"为"/springmvcdemo"或您希望的上下文路径
   - 点击"Apply"和"OK"保存配置

2. **直接运行项目**：
   - 点击工具栏中的绿色"运行"按钮，或按快捷键（通常是Shift+F10）
   - IDEA会编译项目并启动Tomcat，然后自动打开浏览器

3. **使用Maven插件运行**（alternative）or **命令行启动** mvn tomcat7:run：
   - 打开右侧Maven工具窗口
   - 找到Plugins → jetty或tomcat7
   - 双击jetty:run或tomcat7:run来启动项目

4. **访问项目**：
   - 启动成功后，在浏览器访问：http://localhost:8080/springmvcdemo/firstController

5. **重新运行Maven命令(war包问题)**
   - mvn clean package tomcat7:run