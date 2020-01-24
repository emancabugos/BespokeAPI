<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>textarea_html2</name>
   <tag></tag>
   <elementGuidId>1679c6d8-0e12-49be-9103-89042e74bce2</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
         <value>//textarea[@class = 'form-control required']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>textarea</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>rows</name>
      <type>Main</type>
      <value>30</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>form-control required</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>htmlTemplateContent</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>content</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-original-database-value</name>
      <type>Main</type>
      <value>                                                                                                    &lt;body>&lt;div style=&quot;max-width:700px; width:100%; margin:0 auto; border:1px solid #ddd; color:#999; font-size:16px; font-family:sans-serif; line-height:25px;&quot;>
  &lt;div style=&quot;padding:15px;&quot;>
    &lt;div style=&quot;text-align:center; margin-bottom:50px;&quot;> &lt;img src=&quot;{{Logo}}&quot; style=&quot;max-width:200px;&quot; /> &lt;/div>
    &lt;div style=&quot;&quot;>
      &lt;p style=&quot;color:#000; font-weight:bold; margin-bottom:50px;&quot;>Hi {{ConsumerFirstName}},&lt;/p>
      &lt;p>We’ve received your order!&lt;/p>
      &lt;p>Thank you for placing your order with us. Your order will be ready shortly! We’ll notify you once your order is on its way, or when it’s ready for your collection!&lt;/p>
      &lt;p>If you have any questions, please contact us at &lt;a style=&quot;color:#FF5A60; font-weight:bold; text-decoration:none;&quot; href=&quot;mailto:{{SupportEmail}}&quot;>{{SupportEmail}}&lt;/a>. If you wish to change your order please contact your seller directly and let us know.&lt;/p>
    &lt;/div>
    &lt;div style=&quot;border-bottom:1px solid #000; border-top:1px solid #000; padding-top: 10px; padding-bottom: 10px; margin-top:50px;&quot;>
      &lt;table border=&quot;0&quot; style=&quot;width:100%; color:#B3B3B3;&quot;>
        &lt;tr>
          &lt;td style=&quot;font-weight:bold;&quot;>INVOICE ID &lt;span style=&quot;color:#000;&quot;>{{InvoiceNo}}&lt;/span>&lt;/td>
          &lt;td style=&quot;text-align:right;&quot;>{{Timestamp}} &lt;/td>
        &lt;/tr>
      &lt;/table>
    &lt;/div>
    &lt;div style=&quot;margin-top:30px;&quot;>
{{OrderItemsString}}
    &lt;/div>
    &lt;div style=&quot;margin-top:30px;&quot;>
      &lt;table style=&quot;width:100%;&quot;>
        &lt;tr style=&quot;vertical-align:top;&quot;>
          &lt;td style=&quot;line-height: 25px;&quot;>&lt;div style=&quot;color:#000; font-weight:bold;&quot;>Delivery Address :&lt;/div>
            {{DeliveryAddress}}&lt;/td>
          &lt;td style=&quot;line-height:35px; text-align:right; min-width:170px;&quot;>&lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Sub Total&lt;/span>{{CurrencyCode}} {{Subtotal}}&lt;/div>
            &lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Delivery Costs&lt;/span>{{CurrencyCode}} {{ShippingCost}}&lt;/div>
            &lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Bulk Costs&lt;/span>- {{CurrencyCode}} {{BulkDeliveryCost}}&lt;/div>
            &lt;div style=&quot;border-top:1px solid #ddd; padding-top:15px; margin-top:15px;&quot;> &lt;span style=&quot;padding-right:10%; font-size:22px; font-weight:bold;&quot;>TOTAL&lt;/span> &lt;span style=&quot;font-size:22px; color:#000; font-weight:bold;&quot;>{{CurrencyCode}} {{Total}}&lt;/span> &lt;/div>
			&lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Paid&lt;/span>&lt;span style=&quot;min-width:100px;display: inline-block;text-align: right;&quot;>{{CurrencyCode}} {{Paid}}&lt;/span>&lt;/div>
			&lt;div>&lt;span style=&quot;padding-right:10%;&quot;>To be collected&lt;/span>&lt;span style=&quot;min-width:100px;display: inline-block;text-align: right;&quot;>{{CurrencyCode}} {{ToBeCollected}}&lt;/span>&lt;/div>
			&lt;/td>
			
        &lt;/tr>
      &lt;/table>
    &lt;/div>
    &lt;div style=&quot;text-align:center; margin-top:100px; margin-bottom:100px&quot;> &lt;a href=&quot;{{OrderHistoryUrl}}&quot; style=&quot;font-size: 18px; background-color: #FF5A60; text-decoration: none; color: #fff; padding:11.5px 30px; border-radius: 50px; width: 180px; display: inline-block;&quot;>VIEW ORDERS&lt;/a> &lt;/div>
    &lt;div style=&quot;margin-bottom:50px;&quot;>
      &lt;p style=&quot;font-size:18px; font-weight:bold; color:#000;&quot;>We hope to see you again soon!&lt;/p>
      &lt;p>Regards,&lt;br />
        {{Marketname}} edit11111111111111111111111111&lt;/p>      
    &lt;/div>
  &lt;/div>
&lt;/div>&lt;/body>
                                    
                
                
                </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>                                                                                                    &lt;body>&lt;div style=&quot;max-width:700px; width:100%; margin:0 auto; border:1px solid #ddd; color:#999; font-size:16px; font-family:sans-serif; line-height:25px;&quot;>
  &lt;div style=&quot;padding:15px;&quot;>
    &lt;div style=&quot;text-align:center; margin-bottom:50px;&quot;> &lt;img src=&quot;{{Logo}}&quot; style=&quot;max-width:200px;&quot; /> &lt;/div>
    &lt;div style=&quot;&quot;>
      &lt;p style=&quot;color:#000; font-weight:bold; margin-bottom:50px;&quot;>Hi {{ConsumerFirstName}},&lt;/p>
      &lt;p>We’ve received your order!&lt;/p>
      &lt;p>Thank you for placing your order with us. Your order will be ready shortly! We’ll notify you once your order is on its way, or when it’s ready for your collection!&lt;/p>
      &lt;p>If you have any questions, please contact us at &lt;a style=&quot;color:#FF5A60; font-weight:bold; text-decoration:none;&quot; href=&quot;mailto:{{SupportEmail}}&quot;>{{SupportEmail}}&lt;/a>. If you wish to change your order please contact your seller directly and let us know.&lt;/p>
    &lt;/div>
    &lt;div style=&quot;border-bottom:1px solid #000; border-top:1px solid #000; padding-top: 10px; padding-bottom: 10px; margin-top:50px;&quot;>
      &lt;table border=&quot;0&quot; style=&quot;width:100%; color:#B3B3B3;&quot;>
        &lt;tr>
          &lt;td style=&quot;font-weight:bold;&quot;>INVOICE ID &lt;span style=&quot;color:#000;&quot;>{{InvoiceNo}}&lt;/span>&lt;/td>
          &lt;td style=&quot;text-align:right;&quot;>{{Timestamp}} &lt;/td>
        &lt;/tr>
      &lt;/table>
    &lt;/div>
    &lt;div style=&quot;margin-top:30px;&quot;>
{{OrderItemsString}}
    &lt;/div>
    &lt;div style=&quot;margin-top:30px;&quot;>
      &lt;table style=&quot;width:100%;&quot;>
        &lt;tr style=&quot;vertical-align:top;&quot;>
          &lt;td style=&quot;line-height: 25px;&quot;>&lt;div style=&quot;color:#000; font-weight:bold;&quot;>Delivery Address :&lt;/div>
            {{DeliveryAddress}}&lt;/td>
          &lt;td style=&quot;line-height:35px; text-align:right; min-width:170px;&quot;>&lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Sub Total&lt;/span>{{CurrencyCode}} {{Subtotal}}&lt;/div>
            &lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Delivery Costs&lt;/span>{{CurrencyCode}} {{ShippingCost}}&lt;/div>
            &lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Bulk Costs&lt;/span>- {{CurrencyCode}} {{BulkDeliveryCost}}&lt;/div>
            &lt;div style=&quot;border-top:1px solid #ddd; padding-top:15px; margin-top:15px;&quot;> &lt;span style=&quot;padding-right:10%; font-size:22px; font-weight:bold;&quot;>TOTAL&lt;/span> &lt;span style=&quot;font-size:22px; color:#000; font-weight:bold;&quot;>{{CurrencyCode}} {{Total}}&lt;/span> &lt;/div>
			&lt;div>&lt;span style=&quot;padding-right:10%;&quot;>Paid&lt;/span>&lt;span style=&quot;min-width:100px;display: inline-block;text-align: right;&quot;>{{CurrencyCode}} {{Paid}}&lt;/span>&lt;/div>
			&lt;div>&lt;span style=&quot;padding-right:10%;&quot;>To be collected&lt;/span>&lt;span style=&quot;min-width:100px;display: inline-block;text-align: right;&quot;>{{CurrencyCode}} {{ToBeCollected}}&lt;/span>&lt;/div>
			&lt;/td>
			
        &lt;/tr>
      &lt;/table>
    &lt;/div>
    &lt;div style=&quot;text-align:center; margin-top:100px; margin-bottom:100px&quot;> &lt;a href=&quot;{{OrderHistoryUrl}}&quot; style=&quot;font-size: 18px; background-color: #FF5A60; text-decoration: none; color: #fff; padding:11.5px 30px; border-radius: 50px; width: 180px; display: inline-block;&quot;>VIEW ORDERS&lt;/a> &lt;/div>
    &lt;div style=&quot;margin-bottom:50px;&quot;>
      &lt;p style=&quot;font-size:18px; font-weight:bold; color:#000;&quot;>We hope to see you again soon!&lt;/p>
      &lt;p>Regards,&lt;br />
        {{Marketname}} edit11111111111111111111111111&lt;/p>      
    &lt;/div>
  &lt;/div>
&lt;/div>&lt;/body>
                                    
                
                
                </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;content&quot;)</value>
   </webElementProperties>
</WebElementEntity>
