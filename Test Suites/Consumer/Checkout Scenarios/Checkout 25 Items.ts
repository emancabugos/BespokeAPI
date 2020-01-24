<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Checkout 25 Items</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>4def03eb-efd9-48a5-ba74-f9be92e299c4</testSuiteGuid>
   <testCaseLink>
      <guid>5d017ec7-e31e-40b0-be12-7bdc650a23de</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Utilities/CONSUMER/Consumer Login</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>0ac408cf-dac1-4ebc-9ee2-8fac01ceae00</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/CONSUMER/Checkout Scenario/checkout_Flow</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>675e8219-2220-4391-9f97-fb75b6734a9a</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CONSUMER/checkoutUN25</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>675e8219-2220-4391-9f97-fb75b6734a9a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>itemname</value>
         <variableId>1b025926-7f09-45f3-8507-46119c3cb9b9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>675e8219-2220-4391-9f97-fb75b6734a9a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>quantityvalue</value>
         <variableId>0b64dd63-0fe9-45d4-8d3d-13f82e945804</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>675e8219-2220-4391-9f97-fb75b6734a9a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>listname</value>
         <variableId>2edcf3d1-ff8d-4d1a-bdb8-f999cb32c703</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>226bd6de-96ba-41c7-941d-f7d7553805b8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Utilities/MERCHANT/Logout</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
