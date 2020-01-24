<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Invite Buyer Data Driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>726e7fc9-d1fc-44dd-ab12-6070622b8ddf</testSuiteGuid>
   <testCaseLink>
      <guid>47073057-adbf-41bf-ba26-92ebecfc2a65</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Utilities/ADMIN/Admin Login</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>e813a40d-92eb-4952-9211-974c67157c23</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ADMIN/User Mgmt/Users/Buyer Invite</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>043f7ed8-2f32-4767-aae7-821f2b4f964a</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/ADMIN/Buyer List</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>043f7ed8-2f32-4767-aae7-821f2b4f964a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>emailNotif</value>
         <variableId>20e856a0-cb89-4f5f-ac94-f95659c115d3</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>9a0ea770-d27b-468a-8eb0-2b93ffff05a6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Utilities/ADMIN/Admin Logout</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
