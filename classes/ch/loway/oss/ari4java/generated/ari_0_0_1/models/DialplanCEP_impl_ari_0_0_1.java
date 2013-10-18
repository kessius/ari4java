package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;

/** =====================================================
 * Dialplan location (context/extension/priority)
 * 
 * Defined in file :channels.json
 * ====================================================== */
public class DialplanCEP_impl_ari_0_0_1 implements DialplanCEP, java.io.Serializable {
  /**  Context in the dialplan  */
  private String context;
 public String getContext() {
   return context;
 }

 public void setContext(String val ) {
   context = val;
 }

  /**  Extension in the dialplan  */
  private String exten;
 public String getExten() {
   return exten;
 }

 public void setExten(String val ) {
   exten = val;
 }

  /**  Priority in the dialplan  */
  private long priority;
 public long getPriority() {
   return priority;
 }

 public void setPriority(long val ) {
   priority = val;
 }

}
