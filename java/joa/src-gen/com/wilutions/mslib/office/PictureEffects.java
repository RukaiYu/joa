/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PictureEffects.
 * 
 */
@CoInterface(guid="{000C03D2-0000-0000-C000-000000000046}")
public interface PictureEffects extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public PictureEffect getItem(final Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(2)  public PictureEffect Insert(final MsoPictureEffectType EffectType, final Integer Position) throws ComException;
  @DeclDISPID(3)  public void Delete(final Integer Index) throws ComException;
}
