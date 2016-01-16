# fitment
佐岸家具馆





<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.tairanchina</groupId>
	<artifactId>profile</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>pom</packaging>
	
	<!-- 设定团队持续集成发布包服务器 -->
	<distributionManagement>
		<repository>
			<id>nexus-release</id>
			<name>Team Nexus Release Repository</name>
			<url>http://localhost:18081/nexus/content/repositories/releases</url>
		</repository>
		<snapshotRepository>
			<id>nexus-snapshots</id>
			<name>Team Nexus Snapshot Repository</name>
			<url>http://localhost:18081/nexus/content/repositories/snapshots</url>
			<uniqueVersion>false</uniqueVersion>
		</snapshotRepository>
	</distributionManagement>
	
	<modules>
		<!---md framework -->
		<module>./md-parent</module>
		<module>./md-common</module>
		<module>./md-core</module>
		<module>./md-http</module>
		<module>./md-base</module>
		<module>./md-logging</module>
		<module>./md-cas</module>
		<module>./md-account</module>
		<module>./md-pw</module>
		<module>./md-job</module>
		<module>./md-funds</module>
		<module>./md-credit</module>
		<module>./md-wallet</module>
		<module>./md-activity</module>
		<module>./md-tcoin</module>
		<module>./md-admin</module>
		<module>./war-common</module>
		<module>./account</module>
		<module>./funds</module>
		<module>./credit</module>
		<module>./wallet</module>
		<module>./activity</module>
		<module>./admin</module>
		<module>./lianlian</module>
		<module>./tcoin</module>
	</modules>
</project>
