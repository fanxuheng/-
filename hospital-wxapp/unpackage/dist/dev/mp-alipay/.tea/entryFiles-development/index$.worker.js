if(!self.__appxInited) {
self.__appxInited = 1;


require('./config$');


var AFAppX = self.AFAppX.getAppContext
  ? self.AFAppX.getAppContext().AFAppX
  : self.AFAppX;
self.getCurrentPages = AFAppX.getCurrentPages;
self.getApp = AFAppX.getApp;
self.Page = AFAppX.Page;
self.App = AFAppX.App;
self.my = AFAppX.bridge || AFAppX.abridge;
self.abridge = self.my;
self.Component = AFAppX.WorkerComponent || function(){};
self.$global = AFAppX.$global;
self.requirePlugin = AFAppX.requirePlugin;
        

if(AFAppX.registerApp) {
  AFAppX.registerApp({
    appJSON: appXAppJson,
  });
}



function success() {
require('../../app');
require('../../pages/home/appointmentHome/appointment/fromDoctor?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pages/home/appointmentHome/appointment/fromHospital?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pages/home/appointmentHome/appointment/fromDate?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pages/home/appointmentHome/appointment/department?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pages/home/appointmentHome/appointment/fromDep?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../component/noDataPage?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pagesA/pages/creditDetail/component/creditPage?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pagesA/pages/creditDetail/component/historyCredit?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pagesB/pages/center/login/fotgotPassword/components/sendVerificationCode?hash=ec7c5687c7f2ffa836caf3a93e877914426baff6');
require('../../pagesB/pages/center/login/fotgotPassword/components/setPassword?hash=05d2a9730dd6009bf9446182f9c985f40f8c0f43');
require('../../pagesB/pages/appointPages/doctorAppointDetail/component/doctorTreatmentTime?hash=05d2a9730dd6009bf9446182f9c985f40f8c0f43');
require('../../pagesB/pages/appointPages/doctorAppointDetail/component/doctorDetial?hash=05d2a9730dd6009bf9446182f9c985f40f8c0f43');
require('../../pages/photoLogin/photoLogin?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pages/home/appointmentHome/appointmentHome?hash=844a427fc2b243410ed6b2a3bdaaeb149fca0eb1');
require('../../pages/center/center?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pages/home/appointmentHome/selectDepartment/selectDepartment?hash=e67c9aaa566877bfae9f6a25bc44ecd4fa83e19d');
require('../../pagesA/pages/awaitingQueue/awaitingQueue?hash=77826471d77def7119ba70781874233e33ec425c');
require('../../pagesA/pages/creditDetail/creditDetail?hash=9813b441c3d7412a673211a19061088da0a22f83');
require('../../pagesA/pages/appointRecord/appointRecord?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesA/pages/treatRecord/treatRecord?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesA/pages/treatRecord/treatRecordDetail/treatRecordDetail?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesA/pages/aboutUs/aboutUs?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesA/pages/creditDetail/creditAppointDetail/creditAppointDetail?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesB/pages/center/login/login?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesB/pages/center/login/quickRegister/quickRegister?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesB/pages/center/login/fotgotPassword/fotgotPassword?hash=486084d4cae34d10070841bc99897a6cf69c5229');
require('../../pagesB/pages/center/addCard/addCard?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesB/pages/center/addCard/editCard/editCard?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesB/pages/appointPages/timeDoctor/timeDoctor?hash=77826471d77def7119ba70781874233e33ec425c');
require('../../pagesB/pages/appointPages/doctorAppointDetail/doctorAppointDetail?hash=b4ef7ec06d7d21220da632f6fab436745ae305e5');
require('../../pagesB/pages/appointPages/doctorAppointDetail/insureAppoint/insureAppoint?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesB/pages/center/cardList/cardList?hash=77826471d77def7119ba70781874233e33ec425c');
require('../../pagesB/pages/appointPages/doctorList/doctorList?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
require('../../pagesB/pages/center/baseInfo/baseInfo?hash=32d7d2807ed4e666ef03b4b3fe8c38ecf2e34e68');
}
self.bootstrapApp ? self.bootstrapApp({ success }) : success();
}