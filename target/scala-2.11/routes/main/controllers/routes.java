
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Tyrell Wellick/git/kakuro-website/conf/routes
// @DATE:Wed Jan 16 17:45:10 CET 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignInController SignInController = new controllers.ReverseSignInController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWebJarAssets WebJarAssets = new controllers.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSocialAuthController SocialAuthController = new controllers.ReverseSocialAuthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseKakuroController KakuroController = new controllers.ReverseKakuroController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplicationController ApplicationController = new controllers.ReverseApplicationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignUpController SignUpController = new controllers.ReverseSignUpController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignInController SignInController = new controllers.javascript.ReverseSignInController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWebJarAssets WebJarAssets = new controllers.javascript.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSocialAuthController SocialAuthController = new controllers.javascript.ReverseSocialAuthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseKakuroController KakuroController = new controllers.javascript.ReverseKakuroController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplicationController ApplicationController = new controllers.javascript.ReverseApplicationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignUpController SignUpController = new controllers.javascript.ReverseSignUpController(RoutesPrefix.byNamePrefix());
  }

}
